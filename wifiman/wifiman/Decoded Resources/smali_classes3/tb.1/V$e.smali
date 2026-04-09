.class final Ltb/V$e;
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


# static fields
.field public static final a:Ltb/V$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltb/V$e;

    invoke-direct {v0}, Ltb/V$e;-><init>()V

    sput-object v0, Ltb/V$e;->a:Ltb/V$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ltb/u;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ltb/V;->a:Ltb/V;

    invoke-virtual {p1}, Ltb/V;->l()Lib/h;

    move-result-object p1

    invoke-virtual {p1}, Lib/h;->j()V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ltb/u;

    invoke-virtual {p0, p1}, Ltb/V$e;->a(Ltb/u;)V

    return-void
.end method
