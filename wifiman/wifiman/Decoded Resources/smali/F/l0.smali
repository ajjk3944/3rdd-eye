.class public final synthetic LF/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF/t0;


# instance fields
.field public final synthetic a:LF/m0;

.field public final synthetic b:LL0/d$c;


# direct methods
.method public synthetic constructor <init>(LF/m0;LL0/d$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF/l0;->a:LF/m0;

    iput-object p2, p0, LF/l0;->b:LL0/d$c;

    return-void
.end method


# virtual methods
.method public final a(LF/r0;)LF/q0;
    .locals 2

    iget-object v0, p0, LF/l0;->a:LF/m0;

    iget-object v1, p0, LF/l0;->b:LL0/d$c;

    invoke-static {v0, v1, p1}, LF/m0;->a(LF/m0;LL0/d$c;LF/r0;)LF/q0;

    move-result-object p1

    return-object p1
.end method
