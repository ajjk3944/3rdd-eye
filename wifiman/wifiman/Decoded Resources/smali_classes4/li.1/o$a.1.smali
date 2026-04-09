.class public final Lli/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lli/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lli/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lli/o$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lli/o$a;

    invoke-direct {v0}, Lli/o$a;-><init>()V

    sput-object v0, Lli/o$a;->a:Lli/o$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public d()LWh/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
