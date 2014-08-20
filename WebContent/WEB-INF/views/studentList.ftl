
<link rel="stylesheet" type="text/css" href="style.css" />

<div id="main">
List generated at ${.now}
<ul>
<#list studentList as s>
<li>${s.firstName} ${s.lastName}
</#list>
</ul>
</div>
