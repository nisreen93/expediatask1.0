<%@ include file="/views/tagLibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value='/resources/metronic/assets/global/plugins/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet" type="text/css" />
<script src="<c:url value='/resources/js/jquery.min.js'/>"></script> 
<script src="<c:url value='/resources/js/index.js'/>"></script>
</head>

<body>

	<div class="portlet light bordered" style="padding: 50px;">
		<div class="portlet-title">
			<div class="caption">
				<i class="icon-equalizer font-red-sunglo"></i> <span
					class="caption-helper">Choose the API to show the result...</span>
			</div>
			
		</div>
		<div class="portlet-body form">

			<div class="portlet-body">
				<div class="mt-element-list">
					<form id="functionForm">
						<div class="mt-list-head list-default green-haze">
							<div class="row">
								<div class="col-xs-8">
									<div class="list-head-title-container">
										<h3 class="list-title uppercase sbold">Expedia API</h3>
										<div class="list-date"></div>
									</div>
								</div>
							</div>
						</div>
							<div class="form-group">
								<div class="row">
									<!-- for method -->
									<div class="col-md-3">
										<div class="form-group">
											<select id="api" class="form-control" style="width: 100%" onchange="changeApi()"></select>
										</div>
									</div>
									<div class="col-md-9">
										<div class="form-group">
											<input type="text" name="url" id="url" placeholder='SCHEME :// HOST [ ":" PORT ] [ PATH [ "?" QUERY ]]' class="form-control" disabled/>
										</div>
									</div>
								</div>
							</div>
							
							<div class="form-group">
								 <div class="row"> 
									<div class="col-md-12">
										<div class="portlet light">
											<div class="portlet-title">
												<div class="caption">
													<span class="caption-subject font-green-sharp bold uppercase">Response</span>
												</div>
												<div class="actions"></div>
											</div>
											<div class="portlet-body">
												<div class="form-group">
													<textarea id="response" style="width: 100%; height: 300px;" class="form-control" 
														aria-required="true" aria-describedby="text-error" aria-invalid="true"></textarea>
												</div>
											</div>
										</div>
									</div>
								 </div>
							</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>