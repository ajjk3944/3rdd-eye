.class final Lj0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj0/b;


# static fields
.field public static final a:Lj0/i;

.field private static final b:J

.field private static final c:LY0/t;

.field private static final d:LY0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj0/i;

    invoke-direct {v0}, Lj0/i;-><init>()V

    sput-object v0, Lj0/i;->a:Lj0/i;

    sget-object v0, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {v0}, Ll0/m$a;->a()J

    move-result-wide v0

    sput-wide v0, Lj0/i;->b:J

    sget-object v0, LY0/t;->Ltr:LY0/t;

    sput-object v0, Lj0/i;->c:LY0/t;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v0}, LY0/f;->a(FF)LY0/d;

    move-result-object v0

    sput-object v0, Lj0/i;->d:LY0/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()J
    .locals 2

    sget-wide v0, Lj0/i;->b:J

    return-wide v0
.end method

.method public getDensity()LY0/d;
    .locals 1

    sget-object v0, Lj0/i;->d:LY0/d;

    return-object v0
.end method

.method public getLayoutDirection()LY0/t;
    .locals 1

    sget-object v0, Lj0/i;->c:LY0/t;

    return-object v0
.end method
