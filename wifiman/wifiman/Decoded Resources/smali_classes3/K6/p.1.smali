.class public final synthetic LK6/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/q;


# instance fields
.field public final synthetic a:LK6/t;

.field public final synthetic b:LG6/z;


# direct methods
.method public synthetic constructor <init>(LK6/t;LG6/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/p;->a:LK6/t;

    iput-object p2, p0, LK6/p;->b:LG6/z;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LK6/p;->a:LK6/t;

    iget-object v1, p0, LK6/p;->b:LG6/z;

    invoke-static {v0, v1}, LK6/t;->d(LK6/t;LG6/z;)Lgg/v;

    move-result-object v0

    return-object v0
.end method
