.class public LUf/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:LUf/a;

.field public static c:LUf/a;

.field public static d:LUf/a;

.field public static e:LUf/a;

.field public static f:LUf/a;


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LUf/a;

    const-string v1, "none"

    invoke-direct {v0, v1}, LUf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LUf/a;->b:LUf/a;

    new-instance v0, LUf/a;

    const-string v1, "2d"

    invoke-direct {v0, v1}, LUf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LUf/a;->c:LUf/a;

    new-instance v0, LUf/a;

    const-string v1, "3d"

    invoke-direct {v0, v1}, LUf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LUf/a;->d:LUf/a;

    new-instance v0, LUf/a;

    const-string v1, "dgps"

    invoke-direct {v0, v1}, LUf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LUf/a;->e:LUf/a;

    new-instance v0, LUf/a;

    const-string v1, "pps"

    invoke-direct {v0, v1}, LUf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LUf/a;->f:LUf/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUf/a;->a:Ljava/lang/String;

    return-void
.end method

.method public static b(Ljava/lang/String;)LUf/a;
    .locals 1

    sget-object v0, LUf/a;->b:LUf/a;

    invoke-virtual {v0}, LUf/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, LUf/a;->b:LUf/a;

    return-object p0

    :cond_0
    sget-object v0, LUf/a;->c:LUf/a;

    invoke-virtual {v0}, LUf/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, LUf/a;->c:LUf/a;

    return-object p0

    :cond_1
    sget-object v0, LUf/a;->d:LUf/a;

    invoke-virtual {v0}, LUf/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, LUf/a;->d:LUf/a;

    return-object p0

    :cond_2
    sget-object v0, LUf/a;->e:LUf/a;

    invoke-virtual {v0}, LUf/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, LUf/a;->e:LUf/a;

    return-object p0

    :cond_3
    sget-object v0, LUf/a;->f:LUf/a;

    invoke-virtual {v0}, LUf/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    sget-object p0, LUf/a;->f:LUf/a;

    return-object p0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LUf/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LUf/a;->a:Ljava/lang/String;

    return-object v0
.end method
