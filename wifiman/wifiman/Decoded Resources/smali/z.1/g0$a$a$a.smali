.class public final Lz/g0$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/g0$a$a;->a(LT/L;)LT/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/g0;

.field final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(Lz/g0;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lz/g0$a$a$a;->a:Lz/g0;

    iput-object p2, p0, Lz/g0$a$a$a;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Lz/g0$a$a$a;->a:Lz/g0;

    iget-object v1, p0, Lz/g0$a$a$a;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Lz/g0;->b(Landroid/view/View;)V

    return-void
.end method
