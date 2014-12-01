package eu.appbucket.rothar.web.domain.report;

import java.util.Date;

public class ReportData {

	private Integer assetId;
	private Integer reporterId;
	private String reporterUuid;
	private double latitude;
	private double longitude;
	private Date created;

	public Integer getReporterId() {
		return reporterId;
	}

	public void setReporterId(Integer reporterId) {
		this.reporterId = reporterId;
	}

	public Integer getAssetId() {
		return assetId;
	}

	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
	public String getReporterUuid() {
		return reporterUuid;
	}
	
	public void setReporterUuid(String reporterUuid) {
		this.reporterUuid = reporterUuid;
	}
}
