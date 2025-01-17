package app.candash.cluster

object Constants {
    // PandaService may flip these automatically
    const val chassisBus = 0
    const val vehicleBus = 1
    const val anyBus = -1
    const val uiSpeed = "UISpeed"
    const val battVolts = "BattVolts"
    const val stateOfCharge = "UI_SOC"
    const val blindSpotLeft = "BSL"
    const val blindSpotRight = "BSR"
    const val displayBrightnessLev = "displayBrightnessLev"
    const val uiRange = "UI_Range"
    const val isSunUp = "isSunUp"

    const val ipAddressPrefKey = "ip_address_pref_key"
    // For PIWIS-WLAN
    const val ipAddressLocalNetwork = "192.168.4.1"
    const val ipAddressCANServer = "192.168.4.1"
    const val useMockServerPrefKey = "use_mock_server"
    const val turnSignalLeft = "VCFRONT_indicatorLef"
    const val turnSignalRight = "VCFRONT_indicatorRig"
    const val rearLeftVehicle = "rearLeftVehDetected"
    const val rearRightVehicle = "rearRightVehDetected"
    const val leftVehicle = "leftVehDetected"
    const val rightVehicle = "rightVehDetected"
    const val autopilotState = "AutopilotState"
    const val liftgateState = "liftgateState"
    const val frunkState = "frunkState"
    const val uiSpeedUnits = "UISpeedUnits"
    const val fusedSpeedLimit = "fusedSpeedLimit"
    const val fusedSpeedNone = 31f
    const val autopilotHands = "AutopilotHands"
    const val maxSpeedAP = "maxSpeedAP"
    const val cruiseControlSpeed = "CruiseControlSpeed"
    const val uiSpeedHighSpeed = "UISpeedHighSpeed"
    const val gearSelected = "GearSelected"
    const val frontLeftDoorState = "FrontLeftDoor"
    const val frontRightDoorState = "FrontRightDoor"
    const val rearLeftDoorState = "RearLeftDoor"
    const val rearRightDoorState = "RearRightDoor"
    const val battAmps = "BattAmps"
    const val steeringAngle = "SteeringAngle"
    const val vehicleSpeed = "Vehicle Speed"
    const val gearInvalid = 0
    const val gearPark  = 1
    const val gearReverse = 2
    const val gearNeutral = 3
    const val gearDrive = 4
    const val doorOpen = 1
    const val doorClosed = 2
    const val maxDischargePower = "maxDischargePower"
    const val maxRegenPower = "maxRegenPower"
    const val maxHeatPower = "maxHeatPower"
    const val frontTorque = "frontTorque"
    const val rearTorque = "rearTorque"
    const val battBrickMin = "battBrickMin"
    const val driveConfig = "driveConfig"
    const val mapRegion = "mapRegion"
    const val mapUS = 0f
    const val mapEU = 1f
    const val mapNone = 2f
    const val mapCN = 3f
    const val mapAU = 4f
    const val mapJP = 5f
    const val mapTW = 6f
    const val mapKR = 7f
    const val mapME = 8f
    const val mapHK = 9f
    const val mapMO = 10f
    const val awd = 1f
    const val rwd = 0f
    const val frontTemp = "frontTemp"
    const val rearTemp = "rearTemp"
    const val coolantFlow = "coolantFlow"
    const val chargeStatus = "chargeStatus"
    const val chargeStatusActive = 1f
    const val chargeStatusInactive = 0f
    const val uiSpeedTestBus0 = "uiSpeedTestBus0"
    const val indicatorLeft = "indicatorLeft"
    const val indicatorRight = "indicatorRight"
    const val lowBeamLeft = "lowBeamLeft"
    const val lowBeamLeftOff = 0f
    const val lowBeamLeftOn = 1f
    const val highBeamRequest = "highBeamRequest"
    const val autoHighBeamEnabled = "autoHighBeamEnabled"
    const val highLowBeamDecision = "highLowBeamDecision"
    const val highBeamStalkStatus = "highBeamStalkStatus"
    const val frontFogSwitch = "frontFogSwitch"
    const val frontFogSwitchOff = 0f
    const val frontFogSwitchOn = 1f
    const val rearFogSwitch = "rearFogSwitch"
    const val rearFogSwitchOff = 0f
    const val rearFogSwitchOn = 1f
    const val drlMode = "drlMode"
    const val drlModeOff = 0f
    const val drlModePosition = 1f
    const val drlModeDrl = 2f
    const val driverUnbuckled = "driverUnbuckled"
    const val passengerUnbuckled = "passengerUnbuckled"
    const val brakePark = "brakePark"
    const val brakeParkOff = 0f
    const val brakeParkRed = 1f
    const val brakeParkAmber = 2f
    const val brakeHold = "brakeHold"
    const val tpmsSoft = "tpmsSoft"
    const val tpmsHard = "tpmsHard"
    const val odometer = "odometer"
    const val heatBattery = "heatBattery"
    const val conditionalSpeedLimit = "conditionalSpeedLimit"
    const val brakeTempFL = "brakeTempFL"
    const val brakeTempFR = "brakeTempFR"
    const val brakeTempRL = "brakeTempRL"
    const val brakeTempRR = "brakeTempRR"
    const val displayOn = "displayOn"

    // Prefs
    const val forceNightMode = "forceNightMode"
    const val gaugeMode = "gaugeMode"
    const val showSimpleGauges = 0f
    const val showRegularGauges = 1f
    const val showFullGauges = 2f
    const val hideOdometer = "hideOdometer"
    const val hideBs = "hideBs"
    const val hideSpeedLimit = "hideSpeedLimit"
    const val blankDisplaySync = "blankDisplaySync"
    const val tempInF = "tempInF"
    const val powerUnits = "powerUnits"
    const val powerUnitKw = 0f
    const val powerUnitHp = 1f
    const val powerUnitPs = 2f
    const val torqueInLbfFt = "torqueInLbfFt"
    const val hideInstEfficiency = "hideInstEfficiency"
}