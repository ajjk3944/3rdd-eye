.class public final LF/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/K;


# instance fields
.field private final a:LF/t0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LF/t0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF/s0;->a:LF/t0;

    return-void
.end method


# virtual methods
.method public bridge synthetic M(LY0/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LF/s0;->c(LY0/d;Ljava/lang/Object;)LF/s0;

    move-result-object p1

    return-object p1
.end method

.method public final a()LF/t0;
    .locals 1

    iget-object v0, p0, LF/s0;->a:LF/t0;

    return-object v0
.end method

.method public c(LY0/d;Ljava/lang/Object;)LF/s0;
    .locals 0

    return-object p0
.end method
