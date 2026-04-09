.class public final synthetic Lfe/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# instance fields
.field public final synthetic a:Lgg/t;


# direct methods
.method public synthetic constructor <init>(Lgg/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfe/k;->a:Lgg/t;

    return-void
.end method


# virtual methods
.method public final onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lfe/k;->a:Lgg/t;

    invoke-static {v0, p1, p2}, Lfe/n;->a(Lgg/t;Landroid/content/SharedPreferences;Ljava/lang/String;)V

    return-void
.end method
