.class public final synthetic Lv1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lv1/h$e;

.field public final synthetic b:Landroid/graphics/Typeface;


# direct methods
.method public synthetic constructor <init>(Lv1/h$e;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv1/i;->a:Lv1/h$e;

    iput-object p2, p0, Lv1/i;->b:Landroid/graphics/Typeface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv1/i;->a:Lv1/h$e;

    iget-object v1, p0, Lv1/i;->b:Landroid/graphics/Typeface;

    invoke-static {v0, v1}, Lv1/h$e;->a(Lv1/h$e;Landroid/graphics/Typeface;)V

    return-void
.end method
