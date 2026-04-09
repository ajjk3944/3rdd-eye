.class final LT/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/n1;


# static fields
.field public static final a:LT/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT/r0;

    invoke-direct {v0}, LT/r0;-><init>()V

    sput-object v0, LT/r0;->a:LT/r0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NeverEqualPolicy"

    return-object v0
.end method
