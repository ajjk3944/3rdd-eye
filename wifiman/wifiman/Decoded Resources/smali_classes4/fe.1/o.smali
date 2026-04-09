.class public final synthetic Lfe/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# instance fields
.field public final synthetic a:Lfe/s;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lfe/s;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfe/o;->a:Lfe/s;

    iput-object p2, p0, Lfe/o;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    iget-object v0, p0, Lfe/o;->a:Lfe/s;

    iget-object v1, p0, Lfe/o;->b:Ljava/lang/Object;

    invoke-static {v0, v1, p1}, Lfe/s;->d(Lfe/s;Ljava/lang/Object;Lgg/c;)V

    return-void
.end method
