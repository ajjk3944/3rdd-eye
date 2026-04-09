.class public final LIi/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LIi/c0;

.field private static final b:LIi/J;

.field private static final c:LIi/J;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LIi/c0;

    invoke-direct {v0}, LIi/c0;-><init>()V

    sput-object v0, LIi/c0;->a:LIi/c0;

    sget-object v0, LRi/c;->i:LRi/c;

    sput-object v0, LIi/c0;->b:LIi/J;

    sget-object v0, LIi/X0;->c:LIi/X0;

    sput-object v0, LIi/c0;->c:LIi/J;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()LIi/J;
    .locals 1

    sget-object v0, LIi/c0;->b:LIi/J;

    return-object v0
.end method

.method public static final b()LIi/J;
    .locals 1

    sget-object v0, LRi/b;->d:LRi/b;

    return-object v0
.end method

.method public static final c()LIi/H0;
    .locals 1

    sget-object v0, LNi/r;->b:LIi/H0;

    return-object v0
.end method

.method public static final d()LIi/J;
    .locals 1

    sget-object v0, LIi/c0;->c:LIi/J;

    return-object v0
.end method
