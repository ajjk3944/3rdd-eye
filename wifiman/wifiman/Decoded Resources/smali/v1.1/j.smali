.class public final synthetic Lv1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lv1/h$e;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lv1/h$e;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv1/j;->a:Lv1/h$e;

    iput p2, p0, Lv1/j;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv1/j;->a:Lv1/h$e;

    iget v1, p0, Lv1/j;->b:I

    invoke-static {v0, v1}, Lv1/h$e;->b(Lv1/h$e;I)V

    return-void
.end method
