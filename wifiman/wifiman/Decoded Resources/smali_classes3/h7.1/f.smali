.class public final synthetic Lh7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lh7/g;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lh7/g;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh7/f;->a:Lh7/g;

    iput-object p2, p0, Lh7/f;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lh7/f;->a:Lh7/g;

    iget-object v1, p0, Lh7/f;->b:Ljava/util/List;

    check-cast p1, Ll7/c;

    invoke-static {v0, v1, p1}, Lh7/g;->m(Lh7/g;Ljava/util/List;Ll7/c;)LYg/J;

    move-result-object p1

    return-object p1
.end method
