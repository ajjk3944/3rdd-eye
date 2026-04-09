.class final LM8/A$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/A$j;->b(Ljava/lang/Boolean;Ll9/a;Lic/b;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Boolean;

.field final synthetic b:LM8/A;

.field final synthetic c:Lic/b;

.field final synthetic d:LS8/c;


# direct methods
.method constructor <init>(Ljava/lang/Boolean;LM8/A;Lic/b;LS8/c;)V
    .locals 0

    iput-object p1, p0, LM8/A$j$a;->a:Ljava/lang/Boolean;

    iput-object p2, p0, LM8/A$j$a;->b:LM8/A;

    iput-object p3, p0, LM8/A$j$a;->c:Lic/b;

    iput-object p4, p0, LM8/A$j$a;->d:LS8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)LDj/a;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LM8/A$j$a;->a:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LM8/A$j$a;->b:LM8/A;

    iget-object v0, p0, LM8/A$j$a;->c:Lic/b;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v1, p0, LM8/A$j$a;->d:LS8/c;

    invoke-static {p1, v0, v1}, LM8/A;->J0(LM8/A;Lic/b;LS8/c;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, LM8/A$b$a;

    sget-object v0, LFf/d$a$c;->a:LFf/d$a$c;

    invoke-direct {p1, v0}, LM8/A$b$a;-><init>(LFf/d$a;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, LM8/A$j$a;->a(Ljava/lang/Long;)LDj/a;

    move-result-object p1

    return-object p1
.end method
