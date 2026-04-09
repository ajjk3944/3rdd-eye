.class final Ltb/V$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltb/V;->m(Ljava/lang/String;Ljava/lang/String;LGb/f;Llb/b;Lpb/l;Llb/c;ZLtb/V$a;Lmh/l;)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:LGb/f;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;LGb/f;)V
    .locals 0

    iput-object p1, p0, Ltb/V$d;->a:Ljava/lang/String;

    iput-object p2, p0, Ltb/V$d;->b:Ljava/lang/String;

    iput-object p3, p0, Ltb/V$d;->c:LGb/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ltb/V;->a:Ltb/V;

    iget-object v0, p0, Ltb/V$d;->a:Ljava/lang/String;

    iget-object v1, p0, Ltb/V$d;->b:Ljava/lang/String;

    iget-object v2, p0, Ltb/V$d;->c:LGb/f;

    invoke-static {p1, v0, v1, v2}, Ltb/V;->f(Ltb/V;Ljava/lang/String;Ljava/lang/String;LGb/f;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ltb/V$d;->a(Ljava/lang/Throwable;)V

    return-void
.end method
