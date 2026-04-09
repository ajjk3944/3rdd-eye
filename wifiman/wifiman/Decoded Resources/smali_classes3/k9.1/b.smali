.class public final synthetic Lk9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# instance fields
.field public final synthetic a:Lgg/z;

.field public final synthetic b:Lmh/l;


# direct methods
.method public synthetic constructor <init>(Lgg/z;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/b;->a:Lgg/z;

    iput-object p2, p0, Lk9/b;->b:Lmh/l;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lk9/b;->a:Lgg/z;

    iget-object v1, p0, Lk9/b;->b:Lmh/l;

    check-cast p1, Ljava/lang/Long;

    invoke-static {v0, v1, p1}, Lk9/e;->a(Lgg/z;Lmh/l;Ljava/lang/Long;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
