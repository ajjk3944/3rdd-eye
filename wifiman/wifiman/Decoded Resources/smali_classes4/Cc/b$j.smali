.class public final LCc/b$j;
.super LCc/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCc/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation


# static fields
.field public static final b:LCc/b$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LCc/b$j;

    invoke-direct {v0}, LCc/b$j;-><init>()V

    sput-object v0, LCc/b$j;->b:LCc/b$j;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LCc/b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, LCc/b$j;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x1920ec59

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Printer"

    return-object v0
.end method
