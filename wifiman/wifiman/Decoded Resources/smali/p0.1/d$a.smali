.class public final Lp0/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lp0/d$a;

.field private static final b:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp0/d$a;

    invoke-direct {v0}, Lp0/d$a;-><init>()V

    sput-object v0, Lp0/d$a;->a:Lp0/d$a;

    sget-object v0, Lp0/d$a$a;->a:Lp0/d$a$a;

    sput-object v0, Lp0/d$a;->b:Lmh/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lmh/l;
    .locals 1

    sget-object v0, Lp0/d$a;->b:Lmh/l;

    return-object v0
.end method
