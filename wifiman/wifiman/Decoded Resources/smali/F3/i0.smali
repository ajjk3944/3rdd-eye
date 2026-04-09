.class public final LF3/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/Object;


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, LF3/i0;

    invoke-static {v0}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-static {v1}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v1

    invoke-virtual {v0, v1}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    new-instance v1, LF3/h0;

    invoke-direct {v1}, LF3/h0;-><init>()V

    invoke-virtual {v0, v1}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v0

    invoke-virtual {v0}, LF4/c$b;->c()LF4/c;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LF3/i0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF3/i0;->a:Landroid/content/Context;

    return-void
.end method
