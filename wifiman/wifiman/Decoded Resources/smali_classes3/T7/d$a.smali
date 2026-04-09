.class public final LT7/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT7/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LT7/d$a;

.field private static final b:LT7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT7/d$a;

    invoke-direct {v0}, LT7/d$a;-><init>()V

    sput-object v0, LT7/d$a;->a:LT7/d$a;

    new-instance v0, LT7/d$a$a;

    invoke-direct {v0}, LT7/d$a$a;-><init>()V

    sput-object v0, LT7/d$a;->b:LT7/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LT7/d;
    .locals 1

    sget-object v0, LT7/d$a;->b:LT7/d;

    return-object v0
.end method
