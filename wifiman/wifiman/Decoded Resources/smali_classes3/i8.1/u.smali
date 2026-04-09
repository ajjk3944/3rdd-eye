.class public final synthetic Li8/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:Lmh/l;


# direct methods
.method public synthetic constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/u;->a:Lmh/l;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Li8/u;->a:Lmh/l;

    invoke-static {v0, p1}, Li8/y;->e(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method
