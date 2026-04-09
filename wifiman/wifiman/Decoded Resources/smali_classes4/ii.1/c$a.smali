.class public final Lii/c$a;
.super Lii/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lii/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lii/c$a;

.field private static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lii/c$a;

    invoke-direct {v0}, Lii/c$a;-><init>()V

    sput-object v0, Lii/c$a;->a:Lii/c$a;

    sget-object v0, Lii/d;->c:Lii/d$a;

    invoke-virtual {v0}, Lii/d$a;->b()I

    move-result v1

    invoke-virtual {v0}, Lii/d$a;->d()I

    move-result v2

    invoke-virtual {v0}, Lii/d$a;->i()I

    move-result v0

    or-int/2addr v0, v2

    not-int v0, v0

    and-int/2addr v0, v1

    sput v0, Lii/c$a;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lii/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    sget v0, Lii/c$a;->b:I

    return v0
.end method
