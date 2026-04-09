.class public final synthetic LI6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/q;


# instance fields
.field public final synthetic a:LI6/m;

.field public final synthetic b:LG6/z;


# direct methods
.method public synthetic constructor <init>(LI6/m;LG6/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI6/k;->a:LI6/m;

    iput-object p2, p0, LI6/k;->b:LG6/z;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LI6/k;->a:LI6/m;

    iget-object v1, p0, LI6/k;->b:LG6/z;

    invoke-static {v0, v1}, LI6/m;->d(LI6/m;LG6/z;)Lgg/v;

    move-result-object v0

    return-object v0
.end method
