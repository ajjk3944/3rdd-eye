.class public final synthetic Lh7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lh7/g;

.field public final synthetic b:Lk7/a;


# direct methods
.method public synthetic constructor <init>(Lh7/g;Lk7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh7/c;->a:Lh7/g;

    iput-object p2, p0, Lh7/c;->b:Lk7/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lh7/c;->a:Lh7/g;

    iget-object v1, p0, Lh7/c;->b:Lk7/a;

    check-cast p1, Lk7/a;

    invoke-static {v0, v1, p1}, Lh7/g;->i(Lh7/g;Lk7/a;Lk7/a;)LYg/J;

    move-result-object p1

    return-object p1
.end method
