.class public final LIi/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIi/N;


# static fields
.field public static final a:LIi/s0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LIi/s0;

    invoke-direct {v0}, LIi/s0;-><init>()V

    sput-object v0, LIi/s0;->a:LIi/s0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCoroutineContext()Ldh/i;
    .locals 1

    sget-object v0, Ldh/j;->a:Ldh/j;

    return-object v0
.end method
