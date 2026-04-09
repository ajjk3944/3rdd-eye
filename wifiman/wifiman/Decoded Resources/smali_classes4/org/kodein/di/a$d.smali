.class final synthetic Lorg/kodein/di/a$d;
.super Lkotlin/jvm/internal/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/kodein/di/a;->e(Ljava/util/Map;ZI)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final b:Lorg/kodein/di/a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/kodein/di/a$d;

    invoke-direct {v0}, Lorg/kodein/di/a$d;-><init>()V

    sput-object v0, Lorg/kodein/di/a$d;->b:Lorg/kodein/di/a$d;

    return-void
.end method

.method constructor <init>()V
    .locals 4

    const-string v0, "getFullDescription()Ljava/lang/String;"

    const/4 v1, 0x0

    const-class v2, Luj/e;

    const-string v3, "fullDescription"

    invoke-direct {p0, v2, v3, v0, v1}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Luj/e;

    invoke-interface {p1}, Luj/e;->f()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
