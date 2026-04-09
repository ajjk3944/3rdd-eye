.class public final LI/Y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI/o;


# static fields
.field public static final a:LI/Y0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI/Y0;

    invoke-direct {v0}, LI/Y0;-><init>()V

    sput-object v0, LI/Y0;->a:LI/Y0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(II)I
    .locals 0

    const/16 p1, 0xa

    if-ne p2, p1, :cond_0

    const/16 p1, 0x20

    return p1

    :cond_0
    const/16 p1, 0xd

    if-ne p2, p1, :cond_1

    const p1, 0xfeff

    return p1

    :cond_1
    return p2
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "SingleLineCodepointTransformation"

    return-object v0
.end method
