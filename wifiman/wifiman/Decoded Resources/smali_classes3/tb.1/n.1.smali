.class public final synthetic Ltb/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ltb/q;

.field public final synthetic b:Ltb/i;


# direct methods
.method public synthetic constructor <init>(Ltb/q;Ltb/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/n;->a:Ltb/q;

    iput-object p2, p0, Ltb/n;->b:Ltb/i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltb/n;->a:Ltb/q;

    iget-object v1, p0, Ltb/n;->b:Ltb/i;

    check-cast p1, Lgg/A;

    invoke-static {v0, v1, p1}, Ltb/q;->a(Ltb/q;Ltb/i;Lgg/A;)Ltb/q$b;

    move-result-object p1

    return-object p1
.end method
