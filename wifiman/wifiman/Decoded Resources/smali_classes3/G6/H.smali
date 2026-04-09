.class public final synthetic LG6/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/q;


# instance fields
.field public final synthetic a:LG6/L;

.field public final synthetic b:LQ6/g;

.field public final synthetic c:[LQ6/d;


# direct methods
.method public synthetic constructor <init>(LG6/L;LQ6/g;[LQ6/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG6/H;->a:LG6/L;

    iput-object p2, p0, LG6/H;->b:LQ6/g;

    iput-object p3, p0, LG6/H;->c:[LQ6/d;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LG6/H;->a:LG6/L;

    iget-object v1, p0, LG6/H;->b:LQ6/g;

    iget-object v2, p0, LG6/H;->c:[LQ6/d;

    invoke-static {v0, v1, v2}, LG6/L;->h(LG6/L;LQ6/g;[LQ6/d;)Lgg/v;

    move-result-object v0

    return-object v0
.end method
