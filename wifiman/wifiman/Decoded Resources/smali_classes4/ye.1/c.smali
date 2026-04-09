.class public final synthetic Lye/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lye/d$a;


# direct methods
.method public synthetic constructor <init>(Lye/d$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lye/c;->a:Lye/d$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lye/c;->a:Lye/d$a;

    invoke-static {v0}, Lye/d$a;->a(Lye/d$a;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
