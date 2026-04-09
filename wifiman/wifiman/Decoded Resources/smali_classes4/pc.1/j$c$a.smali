.class final Lpc/j$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpc/j$c;->a(Ljava/lang/Boolean;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lpc/j$c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpc/j$c$a;

    invoke-direct {v0}, Lpc/j$c$a;-><init>()V

    sput-object v0, Lpc/j$c$a;->a:Lpc/j$c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LW7/c;)Ll9/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW7/c;

    invoke-virtual {p0, p1}, Lpc/j$c$a;->a(LW7/c;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
