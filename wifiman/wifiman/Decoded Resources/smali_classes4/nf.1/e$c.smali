.class public final Lnf/e$c;
.super Lnf/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnf/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:Lnf/e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnf/e$c;

    invoke-direct {v0}, Lnf/e$c;-><init>()V

    sput-object v0, Lnf/e$c;->a:Lnf/e$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lnf/e;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lnf/e$c;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x309f784c

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Internet"

    return-object v0
.end method
