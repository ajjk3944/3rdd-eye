.class final Lk7/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk7/d;-><init>(Landroid/content/Context;FJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lk7/d;


# direct methods
.method constructor <init>(Lk7/d;)V
    .locals 0

    iput-object p1, p0, Lk7/d$c;->a:Lk7/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LDj/c;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lk7/d$c;->a:Lk7/d;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lk7/d;->f(Lk7/d;Z)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LDj/c;

    invoke-virtual {p0, p1}, Lk7/d$c;->a(LDj/c;)V

    return-void
.end method
