.class public final synthetic Lhb/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lhb/h;


# direct methods
.method public synthetic constructor <init>(Lhb/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/g;->a:Lhb/h;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhb/g;->a:Lhb/h;

    check-cast p1, Lkb/t;

    invoke-static {v0, p1}, Lhb/h;->a(Lhb/h;Lkb/t;)LYg/J;

    move-result-object p1

    return-object p1
.end method
