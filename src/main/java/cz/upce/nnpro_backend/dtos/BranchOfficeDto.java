package cz.upce.nnpro_backend.dtos;

import javax.validation.constraints.NotBlank;

public class BranchOfficeDto {
    private Long id;
    @NotBlank(message = "Region is mandatory.")
    private String region;
    @NotBlank(message = "District is mandatory.")
    private String district;
    @NotBlank(message = "City is mandatory.")
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
