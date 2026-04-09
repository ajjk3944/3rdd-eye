.class public final synthetic Ltb/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ltb/N;

.field public final synthetic b:Ltb/f;


# direct methods
.method public synthetic constructor <init>(Ltb/N;Ltb/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/z;->a:Ltb/N;

    iput-object p2, p0, Ltb/z;->b:Ltb/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltb/z;->a:Ltb/N;

    iget-object v1, p0, Ltb/z;->b:Ltb/f;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Ltb/N;->f(Ltb/N;Ltb/f;Ljava/lang/String;)LYg/J;

    move-result-object p1

    return-object p1
.end method
