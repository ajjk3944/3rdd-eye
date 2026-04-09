.class public final synthetic Lfe/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# instance fields
.field public final synthetic a:Z


# direct methods
.method public synthetic constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lfe/g;->a:Z

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, Lfe/g;->a:Z

    check-cast p1, LWc/b;

    check-cast p2, LWc/b;

    invoke-static {v0, p1, p2}, Lfe/h;->b(ZLWc/b;LWc/b;)LWc/b;

    move-result-object p1

    return-object p1
.end method
