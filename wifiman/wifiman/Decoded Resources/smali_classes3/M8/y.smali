.class public final synthetic LM8/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lic/b;


# direct methods
.method public synthetic constructor <init>(Lic/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM8/y;->a:Lic/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LM8/y;->a:Lic/b;

    check-cast p1, Lde/E;

    invoke-static {v0, p1}, LM8/A;->H0(Lic/b;Lde/E;)Lde/E;

    move-result-object p1

    return-object p1
.end method
