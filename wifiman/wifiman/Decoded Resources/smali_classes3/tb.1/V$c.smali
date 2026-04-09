.class final Ltb/V$c;
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
.field public static final a:Ltb/V$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltb/V$c;

    invoke-direct {v0}, Ltb/V$c;-><init>()V

    sput-object v0, Ltb/V$c;->a:Ltb/V$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lhg/c;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ltb/V;->a:Ltb/V;

    invoke-virtual {p1}, Ltb/V;->l()Lib/h;

    move-result-object p1

    invoke-virtual {p1}, Lib/h;->i()V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, Ltb/V$c;->a(Lhg/c;)V

    return-void
.end method
