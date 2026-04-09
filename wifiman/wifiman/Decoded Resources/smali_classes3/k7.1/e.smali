.class public final synthetic Lk7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:Lk7/d;

.field public final synthetic b:Landroid/media/Image;


# direct methods
.method public synthetic constructor <init>(Lk7/d;Landroid/media/Image;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk7/e;->a:Lk7/d;

    iput-object p2, p0, Lk7/e;->b:Landroid/media/Image;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lk7/e;->a:Lk7/d;

    iget-object v1, p0, Lk7/e;->b:Landroid/media/Image;

    invoke-static {v0, v1}, Lk7/d$b;->a(Lk7/d;Landroid/media/Image;)V

    return-void
.end method
