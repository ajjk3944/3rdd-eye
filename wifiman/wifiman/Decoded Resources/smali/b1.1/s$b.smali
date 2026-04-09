.class public final Lb1/s$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field static final synthetic a:Lb1/s$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb1/s$b;

    invoke-direct {v0}, Lb1/s$b;-><init>()V

    sput-object v0, Lb1/s$b;->a:Lb1/s$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lb1/s$a;
    .locals 2

    new-instance v0, Lb1/t;

    const-string v1, "spread"

    invoke-direct {v0, v1}, Lb1/t;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final b()Lb1/s;
    .locals 2

    new-instance v0, Lb1/t;

    const-string v1, "wrap"

    invoke-direct {v0, v1}, Lb1/t;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final c(F)Lb1/s;
    .locals 2

    new-instance v0, Lb1/t;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lb1/t;-><init>(FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
