.class public final synthetic Lfe/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ljava/lang/Long;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Long;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfe/m;->a:Ljava/lang/Long;

    iput-object p2, p0, Lfe/m;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfe/m;->a:Ljava/lang/Long;

    iget-object v1, p0, Lfe/m;->b:Ljava/lang/String;

    check-cast p1, Landroid/content/SharedPreferences$Editor;

    invoke-static {v0, v1, p1}, Lfe/n;->d(Ljava/lang/Long;Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)LYg/J;

    move-result-object p1

    return-object p1
.end method
