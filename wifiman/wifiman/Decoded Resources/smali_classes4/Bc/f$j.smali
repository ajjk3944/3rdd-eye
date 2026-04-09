.class final LBc/f$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBc/f;->t(Lgg/i;Lgg/i;Lgg/i;I)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LBc/f$j$b;
    }
.end annotation


# instance fields
.field final synthetic a:LBc/f;

.field final synthetic b:I

.field final synthetic c:Lgg/i;

.field final synthetic d:Lgg/i;


# direct methods
.method constructor <init>(LBc/f;ILgg/i;Lgg/i;)V
    .locals 0

    iput-object p1, p0, LBc/f$j;->a:LBc/f;

    iput p2, p0, LBc/f$j;->b:I

    iput-object p3, p0, LBc/f$j;->c:Lgg/i;

    iput-object p4, p0, LBc/f$j;->d:Lgg/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LBc/f$d;)LDj/a;
    .locals 4

    const-string v0, "simState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LBc/f$j$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    const-string v1, "just(...)"

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    new-instance p1, LBc/a$b$b$e;

    iget v0, p0, LBc/f$j;->b:I

    invoke-direct {p1, v0}, LBc/a$b$b$e;-><init>(I)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, LBc/a$b$a$a;->a:LBc/a$b$a$a;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    sget-object p1, LBc/a$b$a$c;->a:LBc/a$b$a$c;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, LBc/f$j;->a:LBc/f;

    invoke-static {p1}, LBc/f;->m(LBc/f;)Lgg/i;

    move-result-object p1

    new-instance v0, LBc/f$j$a;

    iget-object v1, p0, LBc/f$j;->c:Lgg/i;

    iget-object v2, p0, LBc/f$j;->d:Lgg/i;

    iget-object v3, p0, LBc/f$j;->a:LBc/f;

    invoke-direct {v0, v1, v2, v3}, LBc/f$j$a;-><init>(Lgg/i;Lgg/i;LBc/f;)V

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "switchMap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBc/f$d;

    invoke-virtual {p0, p1}, LBc/f$j;->a(LBc/f$d;)LDj/a;

    move-result-object p1

    return-object p1
.end method
