.class public final synthetic Lfe/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:Lfe/s;

.field public final synthetic b:Lgg/c;


# direct methods
.method public synthetic constructor <init>(Lfe/s;Lgg/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfe/p;->a:Lfe/s;

    iput-object p2, p0, Lfe/p;->b:Lgg/c;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    iget-object v0, p0, Lfe/p;->a:Lfe/s;

    iget-object v1, p0, Lfe/p;->b:Lgg/c;

    invoke-static {v0, v1}, Lfe/s;->a(Lfe/s;Lgg/c;)V

    return-void
.end method
