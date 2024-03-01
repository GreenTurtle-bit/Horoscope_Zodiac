
const getUserZodiac = userInput =>{
    userInput = userInput.toLowerCase();
    switch (userInput) {
    case 'cancer':
        return 'Cancer Your friends may offer you the opportunity for an adventure you wouldnt have considered by yourself. Whether your posse wants to hit the road or sign up for a class together, you might as well follow.';
        break;
    case 'virgo':
        return 'Virgo An exciting conversation could stimulate your mind.';
        break;
    case 'leo':
        return 'Leo You have got someone on your side, Leo! That knowledge can inspire you to push toward an ambitious goal.';
        break;
    case 'gemini':
        return 'Gemini Assistance given behind the scenes can bolster you toward a professional goal.';
        break;
    case 'libra':
        return 'Libra A practical approach to present life can bring you rewards.';
        break;
    case 'taurus':
        return 'Taurus Receiving a pep talk from your friends could boost your confidence today, particularly if an encounter with an intimidating authority figure has left you feeling down.';
        break;
    case 'sagittarius':
        return 'Sagittarius Having a clear vision for changes at home can motivate you to take action.';
        break;
    case 'aquarius':
        return 'Aquarius Making wise financial decisions is presently possible. ';
        break;
    case 'pisces':
        return 'Pisece You are equipped to make a compelling case for yourself today.';
        break;
    case 'aries':
        return 'Aries Acting on information that isnt widely known could help you make a fortunate financial decision at this time. Although you may want your friends to benefit from the same wisdom, telling them about your investment can majorly backfire. They might say things that sow doubt in your decision.';
        break;
    case 'scorpio':
        return 'Scorpio Having fun together can currently revitalize a close relationship of yours.';
        break;
    case 'capricorn':
        return 'Capricorn Cheering up the people around you could be a lot of fun today.';
        break;
    default:
        return 'INTRUDER your present is not welcome';
        break;


}
}

console.log(`Welcome Back` + ' ' + getUserZodiac('taurus'))