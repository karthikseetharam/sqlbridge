<#if highestPKIndex != 0>
<#assign a=addAliasStatement(name,beanPackage+"."+name)>
	<select id="get${name}ByPk" parameterType="map" resultType="${name}">
		SELECT
		<@columnSelection/> 
		FROM ${tableName} 
		WHERE
	    <#assign index=0>
		<#list properties as property>
			<#if property.primaryKeyIndex != 0>		
			<#if index == 0><#assign index=1><#else>AND </#if>${property.columnName} = ${getUpdateValue(property.columnName,property.name,property.sqlDataType,driverName)}
			</#if>
		</#list>	
	</select>
</#if>