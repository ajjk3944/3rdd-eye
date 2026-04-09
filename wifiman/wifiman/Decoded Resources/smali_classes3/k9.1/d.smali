.class public final synthetic Lk9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# instance fields
.field public final synthetic a:Lgg/b;

.field public final synthetic b:Lmh/l;


# direct methods
.method public synthetic constructor <init>(Lgg/b;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/d;->a:Lgg/b;

    iput-object p2, p0, Lk9/d;->b:Lmh/l;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lk9/d;->a:Lgg/b;

    iget-object v1, p0, Lk9/d;->b:Lmh/l;

    check-cast p1, Ljava/lang/Long;

    invoke-static {v0, v1, p1}, Lk9/e;->b(Lgg/b;Lmh/l;Ljava/lang/Long;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
