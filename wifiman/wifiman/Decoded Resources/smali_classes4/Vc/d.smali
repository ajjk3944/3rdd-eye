.class public final synthetic LVc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LVc/f;

.field public final synthetic b:Lb7/f;


# direct methods
.method public synthetic constructor <init>(LVc/f;Lb7/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVc/d;->a:LVc/f;

    iput-object p2, p0, LVc/d;->b:Lb7/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LVc/d;->a:LVc/f;

    iget-object v1, p0, LVc/d;->b:Lb7/f;

    check-cast p1, Lb7/f;

    invoke-static {v0, v1, p1}, LVc/f;->d(LVc/f;Lb7/f;Lb7/f;)LVc/h;

    move-result-object p1

    return-object p1
.end method
