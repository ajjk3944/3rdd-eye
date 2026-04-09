.class public final LT0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT0/n;


# static fields
.field public static final a:LT0/m;

.field private static b:LT0/n;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT0/m;

    invoke-direct {v0}, LT0/m;-><init>()V

    sput-object v0, LT0/m;->a:LT0/m;

    new-instance v0, LT0/k;

    invoke-direct {v0}, LT0/k;-><init>()V

    sput-object v0, LT0/m;->b:LT0/n;

    const/16 v0, 0x8

    sput v0, LT0/m;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LT/z1;
    .locals 1

    sget-object v0, LT0/m;->b:LT0/n;

    invoke-interface {v0}, LT0/n;->a()LT/z1;

    move-result-object v0

    return-object v0
.end method
