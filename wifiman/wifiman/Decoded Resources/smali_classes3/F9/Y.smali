.class public final LF9/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LF9/Y;

.field private static final b:Ls9/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF9/Y;

    invoke-direct {v0}, LF9/Y;-><init>()V

    sput-object v0, LF9/Y;->a:LF9/Y;

    sget-object v0, LN9/b;->a:LN9/b;

    invoke-virtual {v0}, LN9/b;->j()Ls9/b;

    move-result-object v0

    sput-object v0, LF9/Y;->b:Ls9/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ls9/b;
    .locals 1

    sget-object v0, LF9/Y;->b:Ls9/b;

    return-object v0
.end method
