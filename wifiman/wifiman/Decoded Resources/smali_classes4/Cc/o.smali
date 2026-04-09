.class public final synthetic LCc/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:La8/b;


# direct methods
.method public synthetic constructor <init>(La8/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCc/o;->a:La8/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LCc/o;->a:La8/b;

    invoke-static {v0}, LCc/p;->d(La8/b;)LCc/p$b;

    move-result-object v0

    return-object v0
.end method
