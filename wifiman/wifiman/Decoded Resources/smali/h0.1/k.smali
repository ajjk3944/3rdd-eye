.class public final synthetic Lh0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lh0/b;

.field public final synthetic b:Landroid/util/LongSparseArray;


# direct methods
.method public synthetic constructor <init>(Lh0/b;Landroid/util/LongSparseArray;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/k;->a:Lh0/b;

    iput-object p2, p0, Lh0/k;->b:Landroid/util/LongSparseArray;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lh0/k;->a:Lh0/b;

    iget-object v1, p0, Lh0/k;->b:Landroid/util/LongSparseArray;

    invoke-static {v0, v1}, Lh0/b$b;->a(Lh0/b;Landroid/util/LongSparseArray;)V

    return-void
.end method
